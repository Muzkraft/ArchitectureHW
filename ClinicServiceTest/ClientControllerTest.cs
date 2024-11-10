using HW10.Controllers;
using HW10.Models;
using HW10.Models.Requests;
using HW10.Services;
using Microsoft.AspNetCore.Mvc;
using Moq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClinicServiceTest
{
    public class ClientControllerTest
    {
        private ClientController _clientController;
        private Mock<IClientRepository> _mockIClientRepository;
        public ClientControllerTest()
        {
            _mockIClientRepository = new Mock<IClientRepository>();
            _clientController = new ClientController(_mockIClientRepository.Object);
        }

        [Fact]
        public void getAllClientsTest()
        {
            // [1.1] Подготовка данных для тестирования

            // [1.2]

            List<Client> list = new List<Client>();
            list.Add(new Client());
            list.Add(new Client());
            list.Add(new Client());

            _mockIClientRepository.Setup(repository =>
                repository.GetAll()).Returns(list);

            //[2] Исполнение тестируемого метода

            var OperationResult = _clientController.GetAll();

            // [3] Подготовка эталонного результата, проверка результата

            // проверяется возвращается ли 
            Assert.IsType<OkObjectResult>(OperationResult.Result);

            // проверяется возвращается ли список объектов типа Client
            Assert.IsAssignableFrom<List<Client>>(((OkObjectResult)OperationResult.Result).Value);

            // проверяется был ли вызван метод GetAll хотя бы раз
            _mockIClientRepository.Verify(repository =>
            repository.GetAll(), Times.AtLeastOnce());
        }

        public static readonly object[][] CorrectCreateClientData =
        {
            new object[] {new DateTime(1986, 4, 30), "111 1111", "Иванов", "Иван", "Иванович"},
            new object[] {new DateTime(1990, 5, 20), "134 1122", "Иванов", "Иван", "Иванович"},
            new object[] {new DateTime(1966, 1, 10), "111 1234", "Иванов", "Иван", "Иванович"},
        };

        [Theory]
        [MemberData(nameof(CorrectCreateClientData))]
        public void CreateClientTest(DateTime birthday, string document, string surname, string firstname, string patronymic)
        {
            _mockIClientRepository.Setup(repository =>
            repository.Create(It.IsNotNull<Client>())).Returns(1).Verifiable();

            var operationResult = _clientController.Create(new CreateClientRequest
            {
                Birthday = birthday,
                Document = document,
                Surname = surname,
                FirstName = firstname,
                Patronymic = patronymic,
            });

            Assert.IsType<OkObjectResult>(operationResult.Result);
            Assert.IsAssignableFrom<int>(((OkObjectResult)operationResult.Result).Value);
            _mockIClientRepository.Verify(repository =>
                repository.Create(It.IsNotNull<Client>()), Times.AtLeastOnce());
        }
    }
}
