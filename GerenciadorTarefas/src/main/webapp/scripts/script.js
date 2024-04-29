function validar() {
    var nome = document.forms["frmCadastro"]["nome"].value;
    var email = document.forms["frmCadastro"]["email"].value;
    var senha = document.forms["frmCadastro"]["senha"].value;

    if (nome == "") {
        document.getElementById("erro-nome").innerHTML = "É necessário preencher o campo Nome";
        document.forms["frmCadastro"]["nome"].focus();
        return false;
    } else {
        document.getElementById("erro-nome").innerHTML = "";
    }

    if (email == "") {
        document.getElementById("erro-email").innerHTML = "É necessário preencher o campo E-mail";
        document.forms["frmCadastro"]["email"].focus();
        return false;
    } else {
        document.getElementById("erro-email").innerHTML = "";
    }

    if (senha == "") {
        document.getElementById("erro-senha").innerHTML = "É necessário preencher o campo Senha";
        document.forms["frmCadastro"]["senha"].focus();
        return false;
    } else {
        document.getElementById("erro-senha").innerHTML = "";
    }

    return true;
}
