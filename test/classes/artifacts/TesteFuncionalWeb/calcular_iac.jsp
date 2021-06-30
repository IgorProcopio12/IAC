<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
      integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculador de Adiposidade Corporal</title>
</head>
<body>
<style>
    body {
        height: auto;
    }

    form.needs-validation.bg-light {
        border: 1px solid #00000057;
        border-radius: 5px;
        box-shadow: 6px 2px 6px #00000082;
    }

    .jumbotron.jumbotron-fluid {
        /* font-size: 56px; */
        padding: 6px;
    }

    h1.display-10 {
        font-size: 48px;
        padding-bottom: 25px;
    }

    form-row {
        margin: 1rem;
    }

    .form-row {
        margin: 12px;
        border-radius: 7px;
    }

    form.needs-validation.bg-light {
        width: 75%;
    }

    label {
        display: flex;
    }

    a.btn.btn-danger.col-md-1 {
        margin-left: 3%;
    }
</style>
<font face="tahoma">


    <div class="form-group d-flex justify-content-center">
        <form action="ServletControllerWeb" method="post" name="frmCadastroAluno"
              onsubmit="return validaFormularioCadastro()" class="needs-validation bg-light">
            <h1>Índice de Adiposidade Corporal</h1>
            <div class="form-row justify-content-center">
                <div class="col-md-4 mb-3">
                    <label>Sexo</label>
                    <select name="vSexo">
                        <option>-</option>
                        <option value="M">Masculino</option>
                        <option value="F">Feminino</option>
                    </select>
                </div>
            </div>
            <div class="form-row justify-content-center">
                <div class="col-md-4 mb-2">
                    <label>Quadril</label>
                    <input type="text" class="form-control" name="vQuadril">
                </div>
            </div>
            <div class="form-row justify-content-center">
                <div class="col-md-4 mb-2">
                    <label>Altura</label>
                    <input type="text" class="form-control" name="vAltura">
                </div>
            </div>
            <div class="d-flex justify-content-center">
            <input type="submit" name="Calcular" value="Calcular" class="btn btn-primary col-md-2">
            <a href="index.jsp" value="Voltar" class="btn btn-secondary col-md-2">Voltar</a>
            </div>
        </form>
    </div>

</font>
<SCRIPT language="JavaScript">
    <!--

    function validaFormularioCadastro() {
        frm = document.frmCadastroAluno;
        var vMensagem;
        var vInconsistente;
        var vRequeridos;
        vMensagem = "";
        vRequeridos = 0;

        if (frm.vQuadril.value === "") {
            vMensagem = "Informe o Tamanho do Quadril.\n" + vMensagem;
            vRequeridos = 1;
            frm.vQuadril.focus();
        }
        if (frm.vAltura.value === "") {
            vMensagem = "Informe a Altura.\n" + vMensagem;
            vRequeridos = 1;
            frm.vAltura.focus();
        }
        if (frm.vSexo.value === "") {
            vMensagem = "Informe o Sexo.\n" + vMensagem;
            vRequeridos = 1;
            frm.vSexo.focus();
        }
        if (vRequeridos === 1) {
            vMensagem = "" + vMensagem;
        }

        if (vMensagem === "") {
            return true;
        } else {
            alert(vMensagem);
            return false;
        }
    }


    //-->
</SCRIPT>
</body>
</html>
