// Function to perform descending order sorting
function compareDescending(a, b) {
    return b - a;
}

// Example array
const numbers = [5, 2, 9, 1, 5, 6];

// Sorting the array in descending order
numbers.sort(compareDescending);

console.log(numbers);
