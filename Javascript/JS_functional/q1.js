function square(x){
    return x*x;
}
function double(x){
    return x*2;
}
function composedValue(square,double,x){
    return (square(double(x)));
}
console.log(composedValue(square,double,5));
document.write(composedValue(square,double,5));