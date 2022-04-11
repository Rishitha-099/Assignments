function square(x){
    return x*x;
}
function double(x){
    return 2*x;
}
function composedValue(square,double,x){
    return square(double(x));
    return double(square(x));

}
console.log(composedValue(square,double,5));
console.log(composedValue(square,double,5));
document.write(composedValue(square,double,5));
document.write(composedValue(double,square,5));