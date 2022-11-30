const assert = require('assert');
const Taxi = require('../taxi.js');


describe('Taxi', function () {
  let taxi;
  beforeEach(function () {
    taxi = new Taxi('Toyota', 'Prius', 'Eric');

  // describe('passengers', function () {
  //   it('should start with no passengers');
  //   });

  });

  it('should have a manufacturer', function () {
    // const taxi = new Taxi('Toyota', 'Prius');      // Arrange
    const actual = taxi.manufacturer;              // Act
    assert.strictEqual(actual, 'Toyota');          // Assert
  });

  it('should have a model', function () {
    // const taxi = new Taxi('Toyota', 'Prius');
    const actual = taxi.model;
    assert.strictEqual(actual, 'Prius');
  });

  it('should have a driver', function () {
    // const taxi = new Taxi('Toyota', 'Prius');
    const actual = taxi.driver;
    assert.strictEqual(actual, 'Eric');
  });

  describe('passengers', function () {
    it('should start with no passengers', function () {
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual, []);
    });
  });

  
});