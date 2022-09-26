package Controller;


import Model.CadastroLista;
import DAO.atividadeDAO;

import java.util.List;

public class CadastroController {
    
    //SALVAR
    public static String salvar(CadastroLista cadastro){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            atividadeDAO.salvar(cadastro);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
    //PROCURAR/LISTAR
    public static List<CadastroLista> procurar(String nomeAtv){
        List<CadastroLista> listaResposta = null;
        
        //Tenta fazer a busca dos dados 
        try{
        
            if (nomeAtv == null || "".equals(nomeAtv)) {
                
                listaResposta = atividadeDAO.listar();
            } else {
                
                listaResposta = atividadeDAO.procurar(nomeAtv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
    
    //ATUALIZAR
    public static String atualizar(CadastroLista cadastro) 
    {
        String resposta = null;

        try
        {
            //tenta fazer a atualizacao
            atividadeDAO.atualizar(cadastro);
        } 
        catch (Exception e) 
        {   
            //em caso de erro retorna para a classe que chamou com o erro
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;        
    }
    
    //EXCLUIR
    public static String excluir(Integer id) 
    {
        String resposta = null;

        try 
        {   
            //tenta excluir 
            
            atividadeDAO.excluir(id);
        } catch (Exception e) 
        {
            //em caso de erro retorna erro para a classe que chamou
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    //OBTER POR ID
    public static CadastroLista obter(Integer id) {
        
        //Instancia cadastro para retornar no fim da funcao
        CadastroLista cadastro =  new CadastroLista();
        
        try 
        {
            //tenta obter o item procurado
             cadastro = atividadeDAO.obter(id);
        } 
        catch (Exception e) 
        {
            //em caso de erro imprime erro 
            e.printStackTrace();
        }

        return cadastro;
    }
    
    //OBTER POR ATIVIDADE
    public static CadastroLista obter2(String nomeAtv) {
        
        //Instancia cadastro para retornar no fim da funcao
        CadastroLista cadastro =  new CadastroLista();
        
        try 
        {
            //tenta obter a atividade procurada
           // cadastro = atividadeDAO.obter(nomeAtv);
        } 
        catch (Exception e) 
        {
            return cadastro = null;
        }

        return cadastro;
    }
}
