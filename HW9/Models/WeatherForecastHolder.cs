namespace HW9.Models
{
    public class WeatherForecastHolder
    {
        /// <summary>
        /// Объект на базе класса WeatherForecastHolder, будет хранить список показателей температуры
        /// </summary>
        private List<WeatherForecast> _values;

        public WeatherForecastHolder()
        {
            /// инициализирую коллекцию для хранения показателей температуры
            _values = new List<WeatherForecast>();
        }

        /// <summary>
        /// Добавление значения температуры в список
        /// </summary>
        /// <param name="date"></param>
        /// <param name="temperatureC"></param>
        public void Add(DateTime dateTime, int temperatureC)
        {
            WeatherForecast forecast = new WeatherForecast();
            forecast.TemperatureC = temperatureC;
            forecast.Date = dateTime;

            _values.Add(forecast);
        }

        /// <summary>
        /// Обновить температуру по дате
        /// </summary>
        /// <param name="date"></param>
        /// <param name="temperatureC"></param>
        /// <returns></returns>
        public bool Update(DateTime date, int temperatureC)
        {
    
            foreach (WeatherForecast forecast in _values)
            {
                if (forecast.Date == date)
                {
                    forecast.TemperatureC = temperatureC;
                    return true;
                }
            }
            return false;
        }

        /// <summary>
        /// Получить показатели температуры за промежуток времени
        /// </summary>
        /// <param name="dateFrom"></param>
        /// <param name="dateTo"></param>
        /// <returns></returns>
        public List<WeatherForecast> Get(DateTime dateFrom, DateTime dateTo)
        {
            List<WeatherForecast> forecastList = new List<WeatherForecast>();
            foreach(WeatherForecast forecast in _values)
            {
                if(forecast.Date >= dateFrom && forecast.Date <= dateTo)
                {
                    forecastList.Add(forecast);
                }
            }
            return forecastList;
        }

        /// <summary>
        /// Удалить показатель температуры по дате
        /// </summary>
        /// <param name="date"></param>
        /// <returns></returns>
        public bool Delete(DateTime date)
        {
            foreach(WeatherForecast forecast in _values)
            {
                if (forecast.Date.Equals(date))
                {
                    _values.Remove(forecast);
                    return true;
                }
            }
            return false;
        }
    }
}
