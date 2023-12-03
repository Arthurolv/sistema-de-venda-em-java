
package com.mycompany.javavendass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Dados {
    private int maxUsu = 50;
    private int maxPro = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private Produto msProdutos[] = new Produto[maxPro];
    private int conUser = 0;
    private int conPro = 0;
    private int numFatura = 0;
    
    public Dados() {
        preencherUsuarios();
        
        preencherProdutos();
        
        preencherConfiguracao();
        
        
        
    }
    public int getNumeroFatura(){
    return numFatura;
    }
    public void setNumeroFatura(){
    this.numFatura = numFatura;
    }
    
    public int numeroUsuarios(){
    return conUser;
    }
    
    public int numeroProdutos(){
    return conPro;
    }
    
    public Usuario[]getUsuarios(){
    return msUsuarios;
    }
     
    public Produto[]getProdutos(){
    return msProdutos;
    }
    
   
 public boolean validarUsuario(String usuario, String senha) {
        for (int i = 0; i < conUser; i++) {
            if (msUsuarios[i].getId().equals(usuario) && msUsuarios[i].getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }


public int posicaoUsuario(String usuario) {
        for (int i = 0; i < conUser; i++) {
            if (msUsuarios[i].getId().equals(usuario)) {
                return i;
            }
        }
        return -1;
    }


    public int posicaoProduto(String Produto) {
        for (int i = 0; i < conPro; i++) {
            if (msProdutos[i].getIdProduto().equals(Produto)) {
                return i;
            }
        }
        return -1;
    }

public String adicionarUsuario(Usuario mUsuario){
    if(conUser == maxUsu){
    return"usuarios maximos atingidos(não sera mais possiel fazer cadastro)";
            }

    msUsuarios[conUser] = mUsuario;
conUser++;
return "Usuário cadastrado com sucesso";
}

   
public String adicionarProduto(Produto mProduto){
    if(conPro == maxPro){
    return"produtos maximos atingidos(não sera mais possiel fazer cadastro)";
            }

    msProdutos[conPro] = mProduto;
conPro++;
return "produto cadastrado com sucesso";
}

public void trocarSenha(String usuario, String senha){
    for(int i = 0; i < conUser; i++){
    if(msUsuarios[i].getId().equals(usuario)){
        msUsuarios[i].setSenha(senha);
        return;
    }
    }
}



public String editarUsuario(Usuario mUsuario, int pos){
   msUsuarios[pos].setNome(mUsuario.getNome());
   msUsuarios[pos].setSobrenome(mUsuario.getSobrenome());
   msUsuarios[pos].setSenha(mUsuario.getSenha());
   msUsuarios[pos].setPerfil(mUsuario.getPerfil());
   
   return "Usuário editado";
}

public String editarProduto(Produto mProduto, int pos){
   msProdutos[pos].setDescricao(mProduto.getDescricao());
   msProdutos[pos].setPreco(mProduto.getPreco());
   msProdutos[pos].setImposto(mProduto.getImposto());
   msProdutos[pos].setAnotacao(mProduto.getAnotacao());
   
   return "Produto editado";
}




public String excluir(int pos){
   for (int i = pos; i < conUser -1; i++){
       msUsuarios[i]= msUsuarios[i +1];
   }
   conUser--;
   return"usuario deletado";
}

public String excluirProduto(int pos){
   for (int i = pos; i < conPro -1; i++){
       msProdutos[i]= msProdutos[i +1];
   }
   conPro--;
   return"produto deletado";
}

public void salvarTodo(){
    salvarUsuarios();
    salvarProdutos();
    salvarConfiguracao();
      
}
public void salvarUsuarios() {
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/usuarios.txt");
        pw = new PrintWriter(fw);

        for (int i = 0; i < conUser; i++) {
            pw.println(msUsuarios[i].toString());
        }
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}


public void salvarProdutos(){
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/produtos.txt");
        pw = new PrintWriter(fw);

        for (int i = 0; i < conPro; i++) {
            pw.println(msProdutos[i].toString());
        }
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
public void salvarConfiguracao() {
    FileWriter fw = null;
    PrintWriter pw = null;
    try {
        fw = new FileWriter("Data/configuracao.ini");
        pw = new PrintWriter(fw);
        
        pw.println("[geral]");
        pw.println("FaturaAtual=" + numFatura);
        
    } catch (Exception e1) {
        e1.printStackTrace();
    } finally {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void preencherUsuarios(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
      arquivo = new File("data/usuarios.txt");
      fr = new FileReader(arquivo);
      br = new  BufferedReader(fr);
      
      int pos;
      String aux;
      String linha;
      String id;
      String nome;
      String sobrenome;
      String senha;
      int perfil;
      
      while((linha = br.readLine())!=null){
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          id = aux;
          linha = linha.substring(pos + 1 );
          
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          nome = aux;
          linha = linha.substring(pos + 1 );
          
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          sobrenome = aux;
          linha = linha.substring(pos + 1 );
          
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          senha = aux;
          linha = linha.substring(pos + 1 );
          perfil = new Integer(linha);
          
          Usuario mUsuario = new Usuario(id,
                  nome,
                  sobrenome,
                  senha,
                  perfil);
          msUsuarios[conUser] = mUsuario;
          conUser++;
      }
      
    }catch (Exception e1 ){
        e1.printStackTrace();
    }finally{
        try {
            if(fr != null)
                fr.close();
        } catch (Exception e2) {
              e2.printStackTrace();
        }
    }
}

public void preencherProdutos(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
      arquivo = new File("data/produtos.txt");
      fr = new FileReader(arquivo);
      br = new  BufferedReader(fr);
      
       int pos;
       String aux;
       String linha;
       String IdProduto;
       String Descricao;
       int Preco;
       int Imposto;
       String Anotacao;
      
      while((linha = br.readLine())!=null){
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          IdProduto = aux;
          linha = linha.substring(pos + 1 );
          
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          Descricao = aux;
          linha = linha.substring(pos + 1 );
          
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          Preco = new Integer(aux);
          linha = linha.substring(pos + 1 );
          
          pos = linha.indexOf('|');
          aux = linha.substring(0,pos);
          Imposto = new Integer(aux);
          linha = linha.substring(pos + 1 );
          
          Anotacao = linha;
          
          Produto mProduto = new Produto(IdProduto,
                  Descricao,
                  Preco,
                  Imposto,
                  Anotacao);
          msProdutos[conPro] = mProduto;
          conPro++;
      }
      
    }catch (Exception e1 ){
        e1.printStackTrace();
    }finally{
        try {
            if(fr != null)
                fr.close();
        } catch (Exception e2) {
              e2.printStackTrace();
        }
    }
}


public void preencherConfiguracao(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
      arquivo = new File("data/configuracao.ini");
      fr = new FileReader(arquivo);
      br = new  BufferedReader(fr);
      
       String linha;
      
      
      while((linha = br.readLine())!=null){
          if(linha.startsWith("FaturaAtual=")){
          numFatura = new Integer(linha.substring(12));
          }
          
      }
      
    }catch (Exception e1 ){
        e1.printStackTrace();
    }finally{
        try {
            if(fr != null)
                fr.close();
        } catch (Exception e2) {
              e2.printStackTrace();
        }
    }
}

    public void setNumeroFatura(int numFatura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}

