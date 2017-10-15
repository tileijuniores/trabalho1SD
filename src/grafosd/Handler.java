/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosd;

/**
 *
 * @author lorena
 */
import java.util.concurrent.Semaphore;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.lang.String;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Handler implements Grafosd.Iface {

    Object grafoInput = null;
    Grafo grafo = new Grafo();
    Vertice vertice = new Vertice();
    Aresta aresta = new Aresta();
    
   
    static Semaphore semaphore = new Semaphore(1);

    
    //cria um vertice e adiciona no grafo
    @Override
    public boolean addVertice(int nome, int cor, String descricao, double peso) {
        
    try {
            semaphore.acquire();
            Thread.sleep(3000);
        }
    catch (Exception e) {
        
         e.printStackTrace();
         InterruptedException ex;

    }
    
        int i;
        boolean aux = true;
        
        if(grafo.vertices != null)// verifica se já existe um vertice de mesmo nome
        {
            for(i=0; i< grafo.vertices.size(); i++)
            {
               if(nome == grafo.vertices.get(i).getNome())
               {
                   aux = false; 
                   break;

               }
            }
        }
        Vertice vertice = new Vertice(nome, cor, descricao, peso);

       
        if(aux == true) //caso nao exista outro vertice com o mesmo nome
        {

            vertice.setCor(cor);
            vertice.setDescricao(descricao);
            vertice.setNome(nome);
            vertice.setPeso(peso);

            grafo.addToVertices(vertice);
        } 
      
        semaphore.release();
        return aux;
	

    }

    //cria uma aresta e adiciona no grafo
    @Override
    public boolean addAresta(int id, int origem, int destino, double peso, int flag, String descricao) {
    
    try {
            semaphore.acquire();
            Thread.sleep(3000);
        }
    catch (Exception e) {
        
         e.printStackTrace();
         InterruptedException ex;

    }
        int i, j;
        boolean aux = false;
                    
            if(grafo.vertices != null)
            {
                for(i=0;i<grafo.vertices.size();i++)
                {
                    if(origem == grafo.vertices.get(i).getNome())
                    {
                        for(j=0;j<grafo.vertices.size();j++)
                        {
                            if(destino == grafo.vertices.get(j).getNome())
                            {
                                
                                Aresta aresta = new Aresta();
                                aresta.setDestino(destino);
                                aresta.setOrigem(origem);
                                aresta.setFlag(flag);
                                aresta.setPeso(peso);
                                aresta.setDescricao(descricao);
                                aresta.setId(id);

                                grafo.addToArestas(aresta);
                                aux = true;
                                break;
                                
                            }   
                        }
                    
                    }
                }
            }

        
       
        
        semaphore.release();
        return aux;
    }     

    //Função que modifica os dados de um vertice ja existente (compara pelo nome).
    @Override
    public boolean modificaVertice(int nome, int cor, String descricao, double peso) {
    
    try {
            semaphore.acquire();
            Thread.sleep(3000);
        }
    catch (Exception e) {
        
         e.printStackTrace();
         InterruptedException ex;

    }
        
        int i;
        boolean aux = false;

        for (i = 0; i < grafo.vertices.size(); i++) {
            if (grafo.vertices.get(i).nome == nome) {
                grafo.vertices.get(i).setDescricao(descricao);
                grafo.vertices.get(i).setPeso(peso);
                grafo.vertices.get(i).setNome(nome);
                aux = true;
                break;
            }
            
              
        }
        
        semaphore.release();
        return aux;
       
    }

    //Função que modifica os dados de uma aresta ja existente (compara por origem e destino)
    @Override
    public boolean modificaAresta(int id, double peso, String descricao, int origem, int destino, int flag) {
    
    try {
            semaphore.acquire();
            Thread.sleep(3000);
        }
    catch (Exception e) {
        
         e.printStackTrace();
         InterruptedException ex;

    }
        int i;
        boolean aux = false;
        Aresta aresta = new Aresta();
        
        for (i = 0; i < grafo.arestas.size(); i++) {
            if (grafo.arestas.get(i).origem == origem && grafo.arestas.get(i).destino == destino) {
                grafo.arestas.get(i).setPeso(peso);
                grafo.arestas.get(i).setFlag(flag);
                grafo.arestas.get(i).setDescricao(descricao);
                break;
            } 
        }
      
        semaphore.release();
        return aux;
    }

    @Override     // compara pelo nome do vertice e printa todas as informações referentes ao vertice
    public Vertice lerVertice(int nome) {
        int contador  = 0;
        try {
            semaphore.acquire();
        
    }
    catch (Exception e) {

         e.printStackTrace();

    }
        int i;

        for (i = 0; i < grafo.vertices.size(); i++) {
            if (grafo.vertices.get(i).nome == nome) {
                String des = grafo.vertices.get(i).getDescricao();
                int corVer = grafo.vertices.get(i).getCor();
                double pesoV = grafo.vertices.get(i).getPeso();
                contador = contador + 1;
            
                break;
            }
           
                
        }
        if (contador == 0)
        {
             Vertice retorno = new Vertice();
             retorno.setDescricao(null);
                 System.out.println("Vertice não criado, desculpe...");
                  semaphore.release();
                 return retorno;
        }
        else
        {
             semaphore.release();
            return grafo.vertices.get(i);
        }
       
    }

    @Override // compara por meio do ID e printa todas as informações da aresta
    public Aresta lerAresta(int ID) {
        int contador = 0;
        try {
            semaphore.acquire();
    }
    catch (Exception e) {

         e.printStackTrace();

    }
        int i;
        Aresta aresta = new Aresta();
        
        for (i = 0; i < grafo.arestas.size(); i++) {
            if (grafo.arestas.get(i).id == ID )
            {
                int id = grafo.arestas.get(i).getId();
                int origem = grafo.arestas.get(i).getOrigem();
                int destino = grafo.arestas.get(i).getDestino();
                double peso = grafo.arestas.get(i).getPeso();
                int flag = grafo.arestas.get(i).getFlag();
                String descricao = grafo.arestas.get(i).getDescricao();
                contador = contador + 1;
                
                break;
            }
            
        }
        if (contador == 0)
        {
              Aresta retorno = new Aresta();
              retorno.setDescricao(null);
              System.out.println("Aresta não criada,  desculpe...");
              semaphore.release();
              return retorno;
        }
        else
        {
            semaphore.release();
            return grafo.arestas.get(i);
        }
    } 

    //Seleciona uma aresta por meio do destino e origem e exclui a mesma
    @Override
    public boolean removeAresta(int origem, int destino) {
    
    try {
            semaphore.acquire();
            Thread.sleep(3000);
        }
    catch (Exception e) {
        
         e.printStackTrace();
         InterruptedException ex;

    }
        int i;
        boolean aux = false;

        for (i = 0; i < grafo.arestas.size(); i++) {
            if (grafo.arestas.get(i).origem == origem && grafo.arestas.get(i).destino == destino) {
                grafo.arestas.remove(i);
                aux = true;
                break;
            } 
        }
        
        semaphore.release();
        return aux;
}
    
    //Seleciona um vertice por meio do nome e exclui o mesmo.
    @Override
    public boolean removeVertice(int nome) {
    
    try {
            semaphore.acquire();
            Thread.sleep(3000);
        }
    catch (Exception e) {
        
         e.printStackTrace();
         InterruptedException ex;

    }
        int i;
        boolean aux = false;

        for (i = 0; i < grafo.vertices.size(); i++) {
            if (grafo.vertices.get(i).nome == nome) {
                grafo.vertices.remove(i);
                aux = true;
                break;
            }     
        }
        
        for (i = 0; i < grafo.arestas.size(); i++) {
            if (grafo.arestas.get(i).origem == nome || grafo.arestas.get(i).destino == nome)
            {
                grafo.arestas.remove(i);
            }
        }
        
        
        semaphore.release();
        return aux;
        }
        
    @Override //lista todos os vertices do grafo
    public List<Vertice> listaVertices() {
        try {
            semaphore.acquire();
    }
    catch (Exception e) {

         e.printStackTrace();

    }
        int i;
        if(grafo.vertices!=null){
        for (i = 0; i < grafo.vertices.size(); i++) {
                int nom = grafo.vertices.get(i).getNome();
                String des = grafo.vertices.get(i).getDescricao();
                int corVer = grafo.vertices.get(i).getCor();
                double pesoV = grafo.vertices.get(i).getPeso();
            
            }
        }
        semaphore.release();
        return grafo.vertices;
    }

    ///lista todas as arestas do grafo
    @Override
    public List<Aresta> listaArestas() {
        try {
            semaphore.acquire();
    }
    catch (Exception e) {

         e.printStackTrace();

    }
        int i;
        if(grafo.arestas != null){
        for (i = 0; i < grafo.arestas.size(); i++) {
                int id = grafo.arestas.get(i).getId();
                int dest = grafo.arestas.get(i).getDestino();
                int orig = grafo.arestas.get(i).getOrigem();
                double peso = grafo.arestas.get(i).getPeso();
                int flag = grafo.arestas.get(i).getFlag();
                String desc = grafo.arestas.get(i).getDescricao();
                
            }

        }
        semaphore.release();
        return grafo.arestas;
    }
    
    @Override // lista arestas de um determinado vertice
    public List<Aresta> listaArestasVertice(int nome) {
        try {
            semaphore.acquire();
    
    }
    catch (Exception e) {

         e.printStackTrace();

    }
        int i;
        List<Aresta> aresta = new ArrayList<Aresta>();
        
        for (i = 0; i < grafo.arestas.size(); i++) {
            if (grafo.arestas.get(i).origem == nome || grafo.arestas.get(i).destino == nome) {
                aresta.add(grafo.arestas.get(i));
                System.out.println("Aresta adicionada");
            }
        }

        semaphore.release();
        return aresta;
    }

    ///listar os vizinhos de um vertice
    @Override
    public List<Vertice> listaVizinhosVertice(int nome) {
        try {
            semaphore.acquire();
        }
    catch (Exception e) {
        
         e.printStackTrace();

    }
        int i;
        List<Vertice> vertices = new ArrayList<Vertice>();
        for (i = 0; i < grafo.arestas.size(); i++) {
            if(grafo.arestas.get(i).getOrigem() == nome)
            {
                for(int j=0; j<grafo.vertices.size(); j++)
                {
                    if(grafo.vertices.get(j).nome == grafo.arestas.get(i).getDestino())
                        vertices.add(grafo.vertices.get(j));
                }
            }
            if(grafo.arestas.get(i).getDestino() == nome) {  
                for(int j=0; j<grafo.vertices.size(); j++)
                {
                    if(grafo.vertices.get(j).nome == grafo.arestas.get(i).getOrigem())
                        vertices.add(grafo.vertices.get(j));
                }
            }
            
        }
        
        
        semaphore.release();
        return vertices;
    }

}

