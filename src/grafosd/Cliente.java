/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosd;

/**
 *
 * @author antonio
 */

import grafosd.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import java.lang.String;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {


        try {
            TTransport transport;

            transport = new TSocket("localhost", 9090);
            transport.open();

            TProtocol protocol = new TBinaryProtocol(transport);
            Grafosd.Client cliente = new Grafosd.Client(protocol);
            
            Grafo grafo = new Grafo();
            Vertice v = new Vertice();
            Aresta a = new Aresta();
            List<Vertice> vertices ;
            List<Aresta> arestas;
            boolean retorno;
            
            cliente.addVertice(1, 15, "v1", 1);
            cliente.addVertice(2, 54, "v2", 2);
            cliente.addVertice(3, 1, "v3", 1);
            cliente.addVertice(4, 154, "v4", 4);
            
            cliente.addAresta(1, 1, 3, 2, 1, "a13");
            cliente.addAresta(1, 2, 3, 4, 1, "a23");
            cliente.addAresta(1, 1, 4, 4, 1, "a14");
            
        int opcao = 0;             
	Scanner s = new Scanner(System.in);
	while(opcao != -1)
  {	
	System.out.println("Escolha uma operação a ser realizada");
    
        System.out.println("1 - Adicionar Aresta\n2 - Adicionar Vertice\n3 - Remover Aresta\n4 - Remover Vertice\n5 - Modificar Aresta\n6 - Modificar Vertice\n7 - Ler Aresta\n8 - Ler Vertice\n9 - Listar Arestas\n10 - Listar Vertices\n11 - Listar Arestas de um Vertice\n12 - 	Listar Vertices Vizinhos de um Vertice\n");
        
        opcao = s.nextInt();
        switch(opcao)
        {
	    
            case 1:
                System.out.println("Digite os dados da aresta.\nID da aresta:");
                int id = s.nextInt();
                System.out.println("Verice de origem: ");
                int origem = s.nextInt();
                System.out.println("Verice de destino: ");
                int destino = s.nextInt();
                System.out.println("Descricao: ");
                s.nextLine();
		String descricao = s.nextLine();
                System.out.println("Peso: ");
                double peso = s.nextDouble();
		System.out.println("Flag: ");
                int flag = s.nextInt();
                retorno = cliente.addAresta(id, origem, destino, peso, flag, descricao);
                if(retorno == false)
                    System.out.println("\nOperação inválida!Vertices de origem e/ou destino não existem \n");
                else
                    System.out.println("\nAresta adicionado com sucesso!\n");
                    
		break;
	    case 2:
                System.out.println("Digite os dados do vertice.\nNome do vertice:");
                int nome = s.nextInt();
		System.out.println("Cor: ");
                int cor = s.nextInt();
                System.out.println("Descricao: ");
                s.nextLine();
		String descricaov = s.nextLine();
                System.out.println("Peso: ");
                double pesov = s.nextDouble();
		retorno = cliente.addVertice(nome, cor, descricaov, pesov);
                if(retorno == true)
                {
                    System.out.println("\nVertice adicionado com sucesso!\n");
                } else 
                    System.out.println("\nO vertice não pode ser adicionado pois ja existe outro com o mesmo nome\n ");
		break;
	    case 3: 
                System.out.println("Digite os dados da aresta.\nVerice de origem: ");
                int origem1 = s.nextInt();
                System.out.println("Vertice de destino: ");
                int destino1 = s.nextInt();
		retorno = cliente.removeAresta(origem1, destino1);
                if(retorno == true)
                    System.out.println("\nAresta removida com sucesso!\n");
                else
                    System.out.println("\nNao exite aresta com essa origem e destino!\n");
                 
		break;
            case 4:
                System.out.println("Digite os dados do vertice.\nNome do vertice:");
                int nome1 = s.nextInt();
                retorno = cliente.removeVertice(nome1);
                if(retorno == true)
                {
                    System.out.println("\nVertice removido com sucesso!");
                    System.out.println("Arestas ligadas a esse vértice tambem foram removidas com sucesso");
                } else
                    System.out.println("Nao existe vertice com esse nome para ser removido!\n");
                break;
            case 5:
                System.out.println("Digite os dados da aresta.\nID da aresta:");
                int id2 = s.nextInt();
                System.out.println("Verice de origem: ");
                int origem2 = s.nextInt();
                System.out.println("Verice de destino: ");
                int destino2 = s.nextInt();
                System.out.println("Descricao: ");
                s.nextLine();
		String descricao2 = s.nextLine();
                System.out.println("Peso: ");
                double peso2 = s.nextDouble();
		System.out.println("Flag: ");
                int flag2 = s.nextInt();
                retorno = cliente.modificaAresta(id2,  peso2, descricao2, origem2, destino2, flag2);
                if(retorno == true)
                    System.out.println("\nAresta modificada com sucesso!\n");
                else
                    System.out.println("\nOs vertices de uma aresta nao podem ser modificados!\n");
		break;
            case 6:
                System.out.println("Digite os dados do vertice.\nNome do vertice:");
                int nome3 = s.nextInt();
		System.out.println("Cor: ");
                int cor3 = s.nextInt();
                System.out.println("Descricao: ");
                s.nextLine();
		String descricao3 = s.nextLine();
                System.out.println("Peso: ");
                double peso3 = s.nextDouble();
		retorno = cliente.modificaVertice(nome3, cor3, descricao3, peso3);
                if(retorno == false)
                    System.out.println("\nEsse vertice nao existe e o nome do vertice nao pode ser modificado!\n");
                else
                    System.out.println("\nVertice modificado com sucesso!\n");
		break;
            case 7:
                System.out.println("Digite os dados da aresta.\nID da aresta:");
                int id4 = s.nextInt();
                a = cliente.lerAresta(id4);
                if(a.descricao == null)
                {
                     System.out.println("Aresta não criada, desculpe...");
                }
                else
                {
                    System.out.println("Aresta de ID: " + a.id);
                    System.out.println("Descrição: " + a.descricao);
                    System.out.println("Peso: " + a.peso);
                    System.out.println("Vertice de Destino: " + a.destino);
                    System.out.println("Vertice de Origem: " + a.origem);
                    System.out.println("Flag: " + a.flag);
                    System.out.println("\n");
                }
                
                break;
            case 8:
                System.out.println("Digite os dados do vertice.\nNome do vertice:");
                int nome5 = s.nextInt();
               
                v = cliente.lerVertice(nome5);
                if(v.descricao == null)
                {
                    System.out.println("Vertice não criado, desculpe...");
                }
                else
                {
                    System.out.println("Vértice de nome: " + v.nome);
                    System.out.println("Descrição: " + v.descricao);
                    System.out.println("Peso: " + v.peso);
                    System.out.println("Cor: " + v.cor);
                    System.out.println("\n");
                }
                
                break;
	    case 9:
                arestas = cliente.listaArestas();
                if(arestas == null)
                    System.out.println("\nNao existem arestas no grafo!");
                else
                {
                    for (int i = 0; i < arestas.size(); i++) {
                        System.out.println("##Aresta: "+(i+1)+"##");
                        System.out.println("Aresta de id: " + arestas.get(i).id);
                        System.out.println("Descriçao: " + arestas.get(i).descricao);
                        System.out.println("Vertice de Origem: " + arestas.get(i).origem);
                        System.out.println("Vertice de Destino: " + arestas.get(i).destino);
                        System.out.println("Peso: " + arestas.get(i).peso);
                        System.out.println("Flag: " + arestas.get(i).flag);
                        System.out.println("\n");

                    }        
                        
                }
		break;
            case 10:
                vertices = cliente.listaVertices();
                if(vertices == null)
                    System.out.println("\nNao existem vertices no grafo!");
                else
                {
                    for(int i=0; i< vertices.size(); i++)
                    {
                        System.out.println("\n##Vertice: "+(i+1)+"##");
                        System.out.println("Vértice de nome: " + vertices.get(i).nome);
                        System.out.println("Descrição: " + vertices.get(i).descricao);
                        System.out.println("Peso: " + vertices.get(i).peso);
                        System.out.println("Cor: " + vertices.get(i).cor);
                        System.out.println("\n");
                    }
                    
                }
                break;
            case 11:
                System.out.println("Digite os dados do vertice.\nNome do vertice:");
                int nome6 = s.nextInt();
                arestas = cliente.listaArestasVertice(nome6);
                for(int i=0; i<arestas.size();i++)
                {
                    System.out.println("Aresta:"+arestas.get(i).id);
                    System.out.println("Descriçao: "+arestas.get(i).descricao);
                    System.out.println("Origem: " + arestas.get(i).origem);
                    System.out.println("Destino: " + arestas.get(i).destino);
                    System.out.println("Peso: " + arestas.get(i).peso);
                    System.out.println("Flag: " + arestas.get(i).flag);
                    System.out.println("\n");
                }
                break;
            case 12:
                System.out.println("Digite os dados do vertice.\nNome do vertice:");
                int nome7 = s.nextInt();
                vertices = cliente.listaVizinhosVertice(nome7);
                System.out.println("##Vizinhos do vértice " + nome7+"##");
                for(int i=0; i<vertices.size();i++)
                {
                    System.out.println("Vizinho"+ (i+1) + ": "+vertices.get(i).nome);
                }
                System.out.print("\n");
                break;
            default:
                System.out.println("Esta opçao nao e valida");
                

        } 
        System.out.println("\n\n");
  }
	transport.close();
        } catch (TException x) {
            x.printStackTrace();
        }
    }
  
}

