const assert = require('assert');

assert.equal(1, '1');// -> will pass
assert.equal([], ![]);// -> will pass

assert.strictEqual('1', '1'); // -> will pass
assert.strictEqual([1, 2, 3], [1, 2, 3]); // -> will fail


// The following test, however, will pass because both variables refer to the exact same array.
const firstArray = [1, 2, 3];
const secondArray = firstArray;
assert.equal(firstArray, secondArray);

// **** assert.deepEqual() and assert.deepStrictEqual() ****
// Assert gives us another set of methods; deepEqual() and deepStrictEqual(). These methods look at the values contained within the object and use those to determine if the objects are equal, rather than checking if the object are the same object.
assert.deepEqual([1, 2, 3], [1, 2, 3]); // -> will pass
assert.deepEqual([1, 2, 3], ['1', '2', '3']); // -> will pass

assert.deepStrictEqual([1, 2, 3], ['1', '2', '3']); // -> will fail