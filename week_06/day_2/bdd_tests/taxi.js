
const Taxi = function (manufacturer, model, driver) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.driver = driver;
    this.passengers = [];
  }
  
  module.exports = Taxi;