<%-- 
    Document   : cadastroCliente
    Created on : 14/10/2012, 13:58:10
    Author     : Guilherme
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Biblioteca Boa Leitura: Cadastro de Livros</h1>
        
        <fieldset>
            <div>
                <form action="#" method="POST">
                    <div>Nome: <input type="text" name="txtNome" value="" /></div>
                    <div>Endere&ccedil;o: <input type="text" name="txtEndereco" value="" /></div>
                    <div>Telefone: <input type="text" name="txtTelefone" value="" /></div>
                    <div>e-mail: <input type="text" name="txtEmail" value="" /></div>
                    <div>
                        <input type="checkbox" name="txtAtivo" value="ativo" /> Usu&aacute;rio Ativo &nbsp;
                        <input type="checkbox" name="txtInativo" value="inativo" /> Usu&aacute;rio Inativo
                    </div><br />
                    <div><input type="submit" value="Cadastrar" />
                        <input type="reset" value="Limpar" /></div>
                </form>
            </div>
        </fieldset>
    </body>
</html>
