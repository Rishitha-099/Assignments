var number=[1,3,5,4,2];
function isEven(number){
    return (number%2==0);
}
function find(isEven){
    document.write(number.find(x=>x%2==0));
}
for(i=0;i<=4;i++){
    document.write(isEven(number[i])+"<br>");
}
find(isEven);