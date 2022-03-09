const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})
readline.question("Enter Your Sequence Divided By A Space >>> ",function(sequece){
    let regex_expression = /^[0-9\s]*$/;
    if(regex_expression.test(sequece)){
        let splitSequence = sequece.split(" ");
        if(splitSequence.length >= 3){
            console.log("Thrid Largest Number Is : "+thridLargestNumber(splitSequence));
        }else{
            console.log("Not enough numbers to find 3rd largest number");
        }
    }else{
        console.log("Invalid input.Only Numbers and spaces is allowed");
    }
    readline.close();
})

function thridLargestNumber(arr){
    let arr_size = arr.length;
    var first = arr[0], second = Number.MIN_VALUE, third = Number.MIN_VALUE;
    for (var i = 1; i < arr_size ; i ++)
    {
        if (arr[i] > first)
        {
            third = second;
            second = first;
            first = arr[i];
        }
        else if (arr[i] > second)
        {
            third = second;
            second = arr[i];
        }
        else if (arr[i] > third)
            third = arr[i];
    }
    return third;
}
