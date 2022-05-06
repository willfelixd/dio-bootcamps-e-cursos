# Trabalhando com Git e GitHub

**1 Gerando uma chave SSH de autenticação no Git bash**
```bash
ssh-keygen

# ler a chave publica no linux
cat /home/<nome-usuario>/.ssh/id_rsa.pub

# ler a chave publica no mac
cat /Users/<nome-usuario>/.ssh/id_rsa.pub
```

**2 Verificar se existe chave SSH configurada**
```bash
ls -al ~/.ssh
```

**3 Configurando a chave SSH no GitHub**
```bash
// Insira um nome para identificar a sua máquina no Github

// No Github vá em "Settings > SSH Keys" (Title + Key)
```

**4 Verificar qual chave SSH está setada**
```bash
ssh -T
```

**5 Crie um repositorio no GitHub**
```bash
Acesse "Repositories" > New
```

**6 Clonando o repositório para a sua máquina**
```bash
No Github copie a URL SSH

No gitBash (git clone + url-repositorio)
```

**7 Inserir caminho do repositorio remoto**
```bash
git remote add origin url-repositorio // origin é o nome do repositório remoto
```

**8 Remover caminho do repositorio remoto**
```bash
git remote rm origin // origin é o nome do repositório remoto
```

**9 Verificar caminho do repositorio remoto que está setado**
```bash
git remote -v
```

**10 Exibir informações sobre o repositório remoto**
```bash
git remote show origin
```

**11 Altera a url do repositório remoto (Máquina local > Github)**
```bash
git remote set-url origin url-repositorio
```

**12 Adicionando mais de um repositório remoto**
```bash
git remote add <nome repositorio> <url repositorio>

Exemplo: 
git remote add github git@github.com:theandersonn/comandos-git.git
git remote add bitbucket git@github.com:theandersonn/comandos-git.git
```

**13 Renomeando repositório remoto**
```bash
git remote rename <nome atual> <novo nome>
```

**14 Enviando as modificações para o GitHub**
```bash
git push origin <branch>
```

**15 Deletando branch remota**
```bash
git push origin nome-branch --delete
git push origin :nome-da-branch
```

**16 Baixando as modificações do GitHub para a sua máquina** (Se o repositório for de sua autoria)
```bash
git pull origin <branch>
```

**17 Baixando o conteúdo de uma branch remota e locomovendo-se para esta nova branch**
```bash
git checkout -b <branch> origin/<branch>
```

**18 Forçando git pull** (Os arquivos que estão locais serão subscritos)
```bash
git fetch --all
git reset --hard origin/<branch>
git pull origin <branch>
```

**19 Mantendo o Repositório Forkado atualizado com o original**
```bash
// Nesse momento o nosso repositório chama-se origin;
// Vamos criar um novo chamado "upstream" que apontará para o original.

git remote add upstream insira-url-ssh-do-repositorio-original
```

**20 Sincronizando os dois repositórios** (upstream e original)
```bash
git fetch upstream
```

**21 Aplicando merge nas atualizações do fork para a branch master do nosso repositório**
```bash
git merge upstream/master
```

**22 Fechar issues através de commits**
```bash
git commit -m "Mensagem commit - fix issue IDIssue"
```

O ID da Issue você consegue na URL da mesma. Ex.: `issues/8` - 8.

Outras palavras chave que podemos usar para fechamento de Issues: `fix, fixes, fixed, close, closes, closed, resolve, resolves, resolved`
