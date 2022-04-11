var personname=('{"Firstname":"Rishitha", "Lastname":"Bhallam"}');
var object=JSON.parse(personname);
object.middlename="Varma";
console.log(object.Firstname);
console.log(object.middlename);
console.log(object.Lastname);
document.write(object.Firstname+" "+object.middlename+" "+object.Lastname);