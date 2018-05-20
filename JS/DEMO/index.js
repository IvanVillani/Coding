function sumNumbers() {
    let numbers = document.getElementsByClassName('numb');
    console.log(Number(numbers[0].value));
    console.log(Number(numbers[1].value));
    let result = Number(numbers[0].value) + Number(numbers[1].value);
    console.log(result);
    document.getElementById('result').innerHTML = result
}
