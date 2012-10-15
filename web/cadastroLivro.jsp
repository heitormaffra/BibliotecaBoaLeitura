<%-- 
    Document   : cadastroLivro
    Created on : 14/10/2012, 13:39:28
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
                    <div>
                        <input type="checkbox" name="txtLivro" value="Livro" />Livro &nbsp;
                        <input type="checkbox" name="txtPeriodico" value="Periodico" /> Peri&oacute;dico
                    </div>
                    <div>T&iacute;tulo: <input type="text" name="txtTitulo" value="" /></div>
                    <div>Autor: <input type="text" name="txtAutor" value="" /></div>
                    <div>Edi&ccedil;&atilde;o: <input type="text" name="txtEdicao" value="" /></div>
                    <div>Editora: <input type="text" name="txtEditora" value="" /></div>
                    <div>ISBN/ISSN: <input type="text" name="txtIsbnIssn" value="" /></div><br />
                    <div><input type="submit" value="Cadastrar" />
                        <input type="reset" value="Limpar" /></div>
                </form>
            </div>
        </fieldset>
    </body>
</html>
