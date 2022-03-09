const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})
readline.question("Enter Your Words Divided By A Space >>> ",function(wordList){

    let regex_expression = /^[a-zA-Z\s]*$/;
    if(regex_expression.test(wordList)){

        let splitArray = wordList.split(" ");

        if(splitArray.length != 2){
            console.log("Invalid Input. Enter your words devided by space and 2 words only");
        }else{
            checkAnagram(splitArray[0],splitArray[1]);
        }

    }else{
        console.log("Invalid Input.Only letters and space is allowed");
    }


    readline.close();
})

function checkAnagram(word1,word2){
    if(word1.length === word2.length){
        let w1 = sort(word1.toLowerCase().split("")).join("");
        let w2 = sort(word2.toLowerCase().split("")).join("");
        console.log(w1 === w2 ? (word1 +" and "+word2 +" are anagram words" ):(word1 +" and "+word2 +" are not anagram words" ));

    }else{
        console.log(word1 +" and "+word2 +" are not anagram words");
    }
}
function sort(list){
    for(let i = 0 ; i< list.length-1;i++){
        for(let j = 0; j<list.length-i-1;j++){
            if(list[j] > list[j+1]){
                let temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
            }
        }
    }
    return list;
}