console.log("in cancel file");

let form = document.getElementById("daForm");
console.log(form);

form.addEventListener('submit', cancelForm);

function cancelForm(eve){
    eve.preventDefault();
    console.log("google button clicked");
}