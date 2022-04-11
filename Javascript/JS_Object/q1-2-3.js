class rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
    getArea(){
        return this.height*this.width
    }

}
var object=new rectangle(4,5);
object.height=50;
console.log(object.height);
document.write("Height: "+object.height+"<br>");
console.log(object.width);
document.write("Width: "+object.width+"<br>");
console.log(object.getArea());
document.write("Area: "+object.getArea());