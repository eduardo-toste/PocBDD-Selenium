# Projeto de Automação com Cucumber, Selenium e Java 🚀

Este projeto é uma prova de conceito de automação de testes utilizando **Cucumber**, **Selenium** e **Java**. Ele demonstra como estruturar e executar testes automatizados de forma eficiente, aplicando boas práticas, Page Object e organização.

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Cucumber**: Framework para escrita e execução de testes no formato BDD.
- **Selenium WebDriver**: Ferramenta para automação de navegadores.
- **Maven**: Gerenciador de dependências e construção do projeto.
- **JUnit**: Biblioteca para execução e organização dos testes.
- **ChromeDriver**: Driver do navegador Google Chrome.

---

## 📂 Estrutura do Projeto

```
pocSelenium/
│
├── .idea/                      # Arquivos de configuração da IDE
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── pocSelenium/
│   │   │       ├── constants/           # Constantes globais
│   │   │       ├── pages/               # Page Objects
│   │   │       │   ├── ButtonsPage.java
│   │   │       │   ├── LoginPage.java
│   │   │       │   └── MainPage.java
│   │   │       └── utils/               # Classes de Utilitários
│   │   │           ├── Delay.java
│   │   │           └── DriverManager.java
│   │   └── resources/                   # Recursos adicionais
│
│   ├── test/
│   │   ├── java/
│   │   │   └── pocSelenium/
│   │   │       ├── hooks/               # Hooks para execução de testes
│   │   │       │   └── Hooks.java
│   │   │       ├── runners/             # Runners para os testes
│   │   │       │   └── RunnerTest.java
│   │   │       └── steps/               # Definições dos Passos
│   │   │           ├── ButtonsSteps.java
│   │   │           └── LoginSteps.java
│   │   └── resources/
│   │       ├── data/                    # Dados adicionais (opcional)
│   │       └── features/                # Arquivos .feature do Cucumber
│   │           ├── buttons.feature
│   │           └── login.feature
│
├── target/                     # Pasta gerada após compilação pelo Maven
├── pom.xml                     # Configurações do Maven
└── README.md                   # Documentação do projeto

```


---

## 🛠️ **Pré-requisitos**

Antes de rodar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

1. **Java Development Kit (JDK)** versão 11 ou superior.
   - [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
2. **Apache Maven** para gerenciar dependências.
   - [Instalação Maven](https://maven.apache.org/install.html)
3. **IDE** de sua escolha (IntelliJ IDEA, Eclipse, VSCode, etc.).
4. **Navegador Chrome** instalado.
5. **Driver do Chrome (chromedriver)** compatível com a versão do seu navegador.
   - [Download do ChromeDriver](https://chromedriver.chromium.org/downloads)

---

## ⚙️ **Configuração do Projeto**

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/eduardo-toste/pocSelenium.git

2. **Navegue até o projeto**:
   ```bash
   cd pocSelenium

3. **Instale as dependências**:
   ```bash
   mvn clean install
