package Controller;

import 

import java.util.List;

public class CadastroController {
    
    //SALVAR
    public static String salvar(Cadastro cadastro){
        
        String resposta = null;
        
        //Tenta fazer a insercao
        try{
            CadastroDao.salvar(cadastro);
        }catch (Exception e){
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        
        return resposta;
    }
    
    //PROCURAR/LISTAR
    public static List<Cadastro> procurar(String nome){
        List<Cadastro> listaResposta = null;
        
        //Tenta fazer a busca dos dados 
        try{
        
            if (nome == null || "".equals(nome)) {
                
                listaResposta = CadastroDao.listar();
            } else {
                
                listaResposta = CadastroDao.procurar(nome);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaResposta;
    }
    
    //ATUALIZAR
    public static String atualizar(Cadastro cadastro) 
    {
        String resposta = null;

        try
        {
            //tenta fazer a atualizacao
            CadastroDao.atualizar(cadastro);
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
            
            CadastroDao.excluir(id);
        } catch (Exception e) 
        {
            //em caso de erro retorna erro para a classe que chamou
            e.printStackTrace();
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }
    
    //OBTER POR ID
    public static Cadastro obter(Integer id) {
        
        //Instancia cliente para retornar no fim da funcao
        CadastroLista cadastro =  new CadastroLista();
        
        try 
        {
            //tenta obter o item procurado
            cliente = ClienteDao.obter(id);
        } 
        catch (Exception e) 
        {
            //em caso de erro imprime erro 
            e.printStackTrace();
        }

        return cliente;
    }
    
    //OBTER POR ATIVIDADE
    public static Cadastro obter2(String nomeAtv) {
        
        //Instancia cliente para retornar no fim da funcao
        CadastroLista cliente =  new CadastroLista();
        
        try 
        {
            //tenta obter a atividade procurada
            cadastro = CadastroDao.obter2(nomeAtv);
        } 
        catch (Exception e) 
        {
            return cliente = null;
        }

        return cliente;
    }
}
