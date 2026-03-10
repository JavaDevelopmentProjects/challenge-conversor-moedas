# 💱 Conversor de Moedas - Challenge Alura

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)
![API](https://img.shields.io/badge/ExchangeRate--API-blue?style=for-the-badge)

## 📝 Descrição do Projeto
Este projeto é um **Conversor de Moedas** robusto desenvolvido em Java. Ele consome dados em tempo real de uma API externa para garantir que as conversões entre Dólar, Real, Peso Argentino e Colombiano estejam sempre atualizadas.

O desafio foca em demonstrar o domínio sobre requisições HTTP, manipulação de JSON e os pilares da Orientação a Objetos.

---

## 🛠️ Tecnologias e Ferramentas

### **Linguagem & Runtime**
* **Java 17+**: Utilização de recursos modernos como `Records`, `HttpClient` e `Switch Expressions` para um código mais limpo e performático.

### **Bibliotecas Externas**
* **Gson (Google)**: Biblioteca essencial para realizar o *parsing* do JSON retornado pela API para objetos Java, permitindo acessar o mapa de taxas de conversão de forma dinâmica.

### **Serviços de Dados**
* **ExchangeRate-API**: Interface de programação que fornece taxas de câmbio globais em tempo real.

---

## 🏗️ Arquitetura do Sistema

O código foi estruturado seguindo o princípio da responsabilidade única:

1.  **`Moedas.java` (Record)**: Uma estrutura de dados leve para mapear os campos `base_code` e o mapa `conversion_rates` vindos do JSON.
2.  **`ConsultaMoeda.java`**: A classe "service" que gerencia a comunicação com o servidor, tratando a URL e convertendo a resposta bruta em um objeto utilizável.
3.  **`Principal.java`**: A interface de usuário via console. Gerencia o loop do menu, as entradas do `Scanner` e exibe os resultados formatados.

---

## 🚀 Como Configurar e Rodar

1. **Chave da API**:
   Obtenha sua chave gratuita em [exchangerate-api.com](https://www.exchangerate-api.com/).

2. **Clone o Repositório**:
   ```bash
   git clone [https://github.com/seu-usuario/conversor-de-moedas.git](https://github.com/seu-usuario/conversor-de-moedas.git)

3. **Adicione o Gson**:
   Baixe o JAR do Gson ou adicione a dependência no seu pom.xml
  ```
  <dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
  </dependency>
```
4. **Execução**:
   Compile e execute a classe **Principal**
