var number=[1,3,5,4,2];
function isEven(number){
    return (number %2==0);
}
function find(number,funct){
    for(var x=0;x,number.length;x++){
        if(funct(number[x])==true)
        return number[x];
        else{
            number.shift();
            return(find(number,funct));
        }
    }
}
document.write(find(number,isEven));