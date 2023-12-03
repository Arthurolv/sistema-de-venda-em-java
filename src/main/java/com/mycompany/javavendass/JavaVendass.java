
package com.mycompany.javavendass;

import formulario.frmLogin;

public class JavaVendass {

    public static void main(String[] args) {
       Dados msDados = new Dados();
       
       Dados_db msDados_db = new Dados_db();
       
       frmLogin miLogin = new frmLogin();
       miLogin.setDados(msDados);
       
       miLogin.setDados_db(msDados_db);
       
       miLogin.setLocationRelativeTo(null);
       miLogin.setVisible(true);
    }
}
