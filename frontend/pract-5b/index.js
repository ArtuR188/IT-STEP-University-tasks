function calculateTriangleArea() {
    const sideA = parseFloat(document.getElementById('sideA').value);
    const sideB = parseFloat(document.getElementById('sideB').value);
    const sideC = parseFloat(document.getElementById('sideC').value);

    if (isValidInput(sideA, sideB, sideC)) {
        const s = (sideA + sideB + sideC) / 2;
        const area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        document.getElementById('result').innerHTML = `Area of the triangle: ${area.toFixed(2)}`;
    } else {
        document.getElementById('result').innerHTML = 'Please enter valid positive numeric values for all sides.';
    }
}

function calculateTriangleArea2() {
    const sideA = parseFloat(document.getElementById('sideA2').value);
    const sideB = parseFloat(document.getElementById('sideB2').value);
    const angle = parseFloat(document.getElementById('angle').value);

    if (isValidInput(sideA, sideB, angle)) {
        const area = (1 / 2) * sideA * sideB * Math.sin(degreesToRadians(angle));
        document.getElementById('result2').innerHTML = `Triangle Area: ${area.toFixed(2)}`;
    } else {
        document.getElementById('result2').innerHTML = 'Invalid input';
    }
}

function calculateTriangleArea3() {
    const side = parseFloat(document.getElementById('side3').value);
    const height = parseFloat(document.getElementById('height3').value);

    if (isValidInput(side, height)) {
        const area = (1 / 2) * side * height;
        document.getElementById('result3').innerHTML = `Triangle Area: ${area.toFixed(2)}`;
    } else {
        document.getElementById('result3').innerHTML = 'Invalid input';
    }
}

function calculateTriangleArea4() {
    const side = parseFloat(document.getElementById('side4').value);
    const height = parseFloat(document.getElementById('height4').value);

    if (isValidInput(side, height)) {
        const area = (1 / 2) * side * height;
        document.getElementById('result4').innerHTML = `Triangle Area: ${area.toFixed(2)}`;
    } else {
        document.getElementById('result4').innerHTML = 'Invalid input';
    }
}

function calculateTriangleArea5() {
    const side1 = parseFloat(document.getElementById('side5a').value);
    const side2 = parseFloat(document.getElementById('side5b').value);
    const side3 = parseFloat(document.getElementById('side5c').value);
    const radius = parseFloat(document.getElementById('radius5').value);

    if (isValidInput(side1, side2, side3, radius)) {
        const semiperimeter = (side1 + side2 + side3) / 2;
        const area = (side1 * side2 * side3) / (4 * radius);
        document.getElementById('result5').innerHTML = `Triangle Area: ${area.toFixed(2)}`;
    } else {
        document.getElementById('result5').innerHTML = 'Invalid input';
    }
}

function checkPalindrome() {
    const number = document.getElementById('number6').value;

    if (isValidInput(number)) {
        const reversedNumber = number.toString().split('').reverse().join('');
        const isPalindrome = number.toString() === reversedNumber;

        document.getElementById('result6').innerHTML = isPalindrome
            ? `${number} is a Palindrome!`
            : `${number} is not a Palindrome.`;
    } else {
        document.getElementById('result6').innerHTML = 'Invalid input';
    }
}

function checkAnagram() {
    const word1 = document.getElementById('word1').value.toLowerCase();
    const word2 = document.getElementById('word2').value.toLowerCase();

    if (isValidInput(word1) && isValidInput(word2)) {
        const sortedWord1 = sortString(word1);
        const sortedWord2 = sortString(word2);
        const isAnagram = sortedWord1 === sortedWord2;

        document.getElementById('result7').innerHTML = isAnagram
            ? 'Anagram!'
            : 'Not an Anagram.';
    } else {
        document.getElementById('result7').innerHTML = 'Invalid input';
    }
}

function calculateFibonacci() {
    const fibonacciNumber = document.getElementById('fibonacciNumber').value;

    if (isValidInput(fibonacciNumber)) {
        const result = fibonacci(parseInt(fibonacciNumber));
        document.getElementById('result8').innerHTML = `Fibonacci(${fibonacciNumber}) = ${result}`;
    } else {
        document.getElementById('result8').innerHTML = 'Invalid input';
    }
}

function checkFibonacci() {
    const fibonacciCheckNumber = document.getElementById('fibonacciCheckNumber').value;

    if (isValidInput(fibonacciCheckNumber)) {
        const result = isFibonacci(parseInt(fibonacciCheckNumber));
        const message = result ? 'belongs to' : 'does not belong to';
        document.getElementById('result9').innerHTML = `${fibonacciCheckNumber} ${message} Fibonacci sequence`;
    } else {
        document.getElementById('result9').innerHTML = 'Invalid input';
    }
}

function isFibonacci(n) {
    return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
}

function isPerfectSquare(x) {
    const sqrtX = Math.sqrt(x);
    return sqrtX === Math.floor(sqrtX);
}

function isValidInput(...inputs) {
    return inputs.every(input => !isNaN(input) && input > 0);
}

function degreesToRadians(degrees) {
    return (degrees * Math.PI) / 180;
}

function sortString(str) {
    return str.split('').sort().join('');
}
