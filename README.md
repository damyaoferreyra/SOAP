# soap
Simple application SOAP

baixar tomcat 8.5
adicionar a lib JAX-WS: https://github.com/javaee/metro-jax-ws,  na pasta lib do tomcat
  Abrir o projeto
	Em window > Perspective
		adicionar o server
	Em server
		adicionar o tomcat
			basta apontar para a pasta onde está o download do tomcat.
	Nas properties do server, botão direito do mouse.
		Em general: switch location, para usar o tomcat externo. não [workspace metada]
	Nas configurações do server, botão direito > open | F3
		Selecionar: use tomcat installation (takes control of tomcat installaction) em server locations


Rodando o projeto: run as > Run on Server

Criar o arquivo de configuração wsdl
Selecione a classe que implenta a interface e no menu do botão direiro, escolha a opção web services > create webservice. next até finalizar.

obs.: será criado uma pasta WebContent > wsdl e dentro terá o arquivo de configuração wsdl. No final do arquivo, podemos encontrar a url para acessar o serviço.

No ex. temos: http://localhost:8080/WebServiceSOAP/services/HelloImp.  basta colocar ?wsdl no final da url.
