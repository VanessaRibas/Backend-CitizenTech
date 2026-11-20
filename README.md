# SOS Rota — Urban Risk Intelligence Platform (Backend)

**Disciplina:** Advanced Programming and Mobile Dev

## Visão Geral do Projeto

O **SOS Rota** é uma solução desenvolvida no contexto da **Urban Risk Intelligence Platform**, concebida para o monitoramento contínuo, a análise de riscos urbanos e o suporte à mobilidade acessível em cenários cotidianos e climáticos adversos — como alagamentos, acidentes, incêndios, ventos fortes, ilhas de calor e interrupções de serviços essenciais.

Em ambientes urbanos densos, pessoas com deficiência (PCD) — especialmente cadeirantes e pessoas cegas ou com baixa visão — enfrentam vulnerabilidades adicionais quando trajetos não consideram restrições de acessibilidade ou quando ocorrências surgem no percurso. O **SOS Rota** trata os pontos de risco como variáveis dinâmicas de deslocamento e oferece respostas orientadas ao contexto:

- **Redirecionamento de rota:** cálculo e adoção de rotas alternativas para atingir o destino com segurança, respeitando especificidades de acessibilidade.
- **Busca de abrigos:** localização de pontos de proteção seguros quando o deslocamento até o destino não é viável.
- **Retorno seguro:** direcionamento para a residência do usuário ou de um familiar/responsável da rede de apoio, caso o usuário esteja fora da zona de risco e sem abrigo disponível.
- **Acionamento de emergência:** solicitação de apoio, resgate ou despacho de viatura/SAMU/responsável quando o usuário se encontra em área desprotegida.

A arquitetura é dividida em duas camadas integradas:
- **Backend (Java + Spring Boot):** ingere e consolida dados provenientes de sensores (reais ou simulados), bases públicas e registros comunitários ou da rede de apoio, realiza a persistência em banco de dados e expõe uma API REST com priorização de alertas, rastreabilidade de origem e indicador de nível de confiança.
- **Frontend Mobile (React Native):** consome a API REST para prover experiências específicas por perfil (**PCD**, **Rede de Apoio** e **Defesa Civil**), incluindo visualização em mapa em tempo real, rotas dinâmicas, alertas regionais e acionamento de SOS.

---

## Repositórios e Demonstração

| Recurso | Link |
| :--- | :--- |
| **Repositório Backend (Spring Boot)** | [https://github.com/VanessaRibas/Backend-CitizenTech](https://github.com/VanessaRibas/Backend-CitizenTech) |
| **Repositório Frontend (React Native)** | [https://github.com/VanessaRibas/Front-end-CitizenTech](https://github.com/VanessaRibas/Front-end-CitizenTech) |
| **Vídeo de Demonstração** | [https://youtu.be/tYD78cd5tSg?si=UsVxuoTHq6u60d_D](https://youtu.be/tYD78cd5tSg?si=UsVxuoTHq6u60d_D) |

---

## Funcionalidades do Backend

O serviço em Spring Boot centraliza as regras de negócio, a persistência de dados e a orquestração de eventos entre os perfis da plataforma:

1. **Gerenciamento de Usuários e Perfis (`PCD`, `CONTATO`, `ADMIN`):**
   - Administração de contas e perfis de acesso, incluindo a atualização dinâmica do tipo de deficiência no perfil PCD (como mobilidade reduzida/cadeirante ou deficiência visual) para adequação de rotas alternativas.
2. **Gestão da Rede de Apoio e Contatos de Emergência:**
   - Vinculação entre usuários, perfis PCD e contatos de emergência, viabilizando o monitoramento de múltiplos PCDs por um mesmo membro da rede de apoio, acompanhamento de localização em tempo real e envio de eventos.
3. **Ingestão, Persistência e Priorização de Alertas:**
   - Consolidação de ocorrências oriundas de sensores, fontes públicas e relatos da comunidade/rede de apoio, expondo endpoints REST que ordenam e priorizam alertas com indicação explícita da **origem** e do **nível de confiança** de cada informação.
4. **Fluxo Operacional da Defesa Civil:**
   - Recebimento de eventos submetidos para conferência e validação, confirmação de ocorrências para exibição nos dispositivos e disparo de alertas/notificações segmentadas por região.
5. **Tratamento de Chamados SOS:**
   - Registro e propagação de sinais de emergência disparados pelo botão de SOS do usuário PCD, permitindo notificação imediata à rede de apoio e suporte ao despacho de viaturas, SAMU ou responsáveis.
6. **Suporte a Decisão e Mobilidade Dinâmica:**
   - Disponibilização de dados estruturados de riscos, pontos de apoio/abrigos e rotas para sustentar as estratégias de deslocamento e contingência na aplicação mobile.

---

## Execução do Backend

### Pré-requisitos
- **Java (JDK)** compatível com o projeto configurado em Spring Boot.
- **IDE Java** (IntelliJ IDEA, Eclipse ou VS Code) ou ferramenta de build (Maven/Gradle).
- **Banco de dados** configurado conforme as propriedades da aplicação.

### Passo a Passo
1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/VanessaRibas/Backend-CitizenTech.git](https://github.com/VanessaRibas/Backend-CitizenTech.git)
