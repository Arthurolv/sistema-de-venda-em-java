
package com.mycompany.javavendass;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Dados_db {
    private Connection cnn;
    
    public Dados_db(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://localhost/vendas";
            cnn =DriverManager.getConnection(db,"root","");
        } catch (Exception ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
    public boolean validarUsuario(String usuario, String senha) {
  
    try {
        String sql = "select 1 from usuarios where id = '"
                + usuario + "' and senha = '" + senha + "'";
        Statement st = cnn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
    
   }
    public boolean existeUsuario(String usuario){
         try {
        String sql = "select (1) from usuarios where id = '"
                + usuario +  "'";
        Statement st = cnn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
    }
    
    public boolean existeProduto(String produto){
         try {
        String sql = "select (1) from produtos where idProduto = '"
                + produto +  "'";
        Statement st = cnn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
    }
    
    
public String adicionarUsuario(Usuario mUsuario){
    try {
        String sql = "insert into usuarios values ('"+ mUsuario.getId() +"','"+ mUsuario.getNome()+"','"+mUsuario.getSobrenome()+"','"+mUsuario.getSenha()+"', "+mUsuario.getPerfil()+" )";
        Statement st = cnn.createStatement();
        st.executeUpdate(sql);
        return "Usuário cadastrado com sucesso";
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        return"nao foi possivel cadastrar esse usuario";
    }
}

public String adicionarProduto(Produto mProduto){
    try {
        String sql = "insert into produtos values ('"
                + mProduto.getIdProduto() + "', '"
                + mProduto.getDescricao() + "', "
                + mProduto.getPreco() + ", "
                + mProduto.getImposto() + ", '"
                + mProduto.getAnotacao() + "' )";
        Statement st = cnn.createStatement();
        st.executeUpdate(sql);
        return "produto cadastrado com sucesso";
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        return"nao foi possivel cadastrar esse produto";
    }
}

public String editarUsuario(Usuario mUsuario){
        try {
            String sql = "update usuarios set "
                    + "nome ='"+ mUsuario.getNome() +"', "
                    + "sobrenome ='"+ mUsuario.getSobrenome()+"', "
                    + "senha ='"+ mUsuario.getSenha()+"', "
                    + "idPerfil ="+ mUsuario.getPerfil()+" "
                    + "where id ='"+mUsuario.getId()+"'";
                    
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            
            return "Usuário editado";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return"nao foi possivel editar esse usuario";
        }
}

public String editarProduto(Produto mProduto){
        try {
            String sql = "update produtos set "
                    + "descricao = '" + mProduto.getDescricao() + "', "
                    + "preco = " + mProduto.getPreco() + ", "
                    + "idImposto = " + mProduto.getImposto() + ", "
                    + "notas =  '" + mProduto.getAnotacao()+ "' "
                    + "where idProduto ='" + mProduto.getIdProduto() + "'";
                    
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            
            return "Produto editado";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return"nao foi possivel editar esse produto";
        }
}

public String excluir(String usuario){
        try {
            String sql = "delete from usuarios where id = '"+usuario+"'";
            
            
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            
            return"usuario deletado";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return"não foi possiel deletar esse usuario";
        }
}
        
        public String excluirProduto(String produto){
        try {
            String sql = "delete from produtos where idProduto = '"+ produto +"'";
            
            
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            
            return"produto deletado";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return"não foi possiel deletar esse produto";
        }
        
        }

    public ResultSet getUsuarios(){
        try {
            String sql = "select * from usuarios";
            
            
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
    
    
     public ResultSet getFatura(){
        try {
            String sql = "select * from fatura";
            
            
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
    
     public ResultSet getProdutos(){
        try {
            String sql = "select * from produtos";
            
            
            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
}
     
     public int numeroUsuarios(){
          try {
             String sql = "select count (*) as num from usuarios";
            
            
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
            return rs.getInt("num");
            }else{
             return 0;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
                         return 0;

        }
    }
     
     public int numeroProdutos(){
          try {
             String sql = "select count(*) as num from produtos";
            
            
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
            return rs.getInt("num");
            }else{
             return 0;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
                         return 0;

        }
    }
     
     public Produto getProduto(String idProduto){
        try {
            Produto mProduto = null;
            String sql ="select * from produtos where idProduto = '"+ idProduto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                mProduto = new Produto(
                rs.getString("idProduto"),
                rs.getString("descricao"),
                rs.getInt("preco"),
                rs.getInt("idImposto"),
                rs.getString("notas"));
                
                
            }
            return mProduto;
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
     
    public int getNumeroFatura(){
        try {
            String sql ="select max(idFatura) as num from fatura ";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("num") +1;
            }else{
            return 1;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    
    }
     
   public void adicionarFatura(int idFatura, String idUsuario){
    try {
        String sql = "INSERT INTO fatura (idFatura, idUsuario) VALUES (" + idFatura + ", '" + idUsuario + "')";

                
        Statement st = cnn.createStatement();
        st.executeUpdate(sql);
        
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        
    }
}

      public void adicionarDetalheFatura(int idFatura, int idLinha, String idProduto, String descricao, int preco,int quantidade){
    try {
       String sql = "insert into detalheFatura values ("
                + idFatura + ", "
                + idLinha + ", '"
                + idProduto + "', '"
                + descricao + "', "
                + preco + ", "
                + quantidade + ")";

                
        Statement st = cnn.createStatement();
        st.executeUpdate(sql);
        
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        
    }
}

      public ResultSet getConsulta(String sql) {
    try {
        Statement st = cnn.createStatement();
        return st.executeQuery(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        return null;
    }
}
      
      public void trocarSenha(String usuario, String senha){
           try {
            String sql = "update usuarios set "
                    + "senha = '" + senha + "' "
                    + "where id = '" + usuario + "'";
                    
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            
        }
}


     
     
     
}
    
        
            

    
    


         

    
        


