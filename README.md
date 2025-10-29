trial hello file
here is gyan Sharma 
trying to learn github 

created github account 

created a new repo

install git on my system 
  pkg install git-

downloading repo by running command on terminal 
  >>> git clone (name of git repo OR repo link)

now open your file you downloaded from git on file editor and also on terminal
  use >>> cd  command to enter file
  cheack all file (hiden file include) in it by the >>> ls -al  command
  
open readme file on code editor 
  edit the file and save it 
    (updateing the git readme file useing acoda on my samsung tab)

  now run >>> git status  command on terminal
    it will show all the current changes made locally
  
  create a new file in the folder 
  
    ex helloGyan.html
      (
      <h1>Hello Gyan </h1>
      )
    and save it
    
    now on terminal run >>> git add <file name >
      When you make changes in your project (edit, delete, or add files), Git doesn’t automatically track those changes.
      To tell Git which files you want to include in the next commit, you use git add.
      
      for Multiple Files
      To stage all changed files:

        >>> git add .

      or
        
        >>> git add -A
    
    
    >>> git status
      Files in green = staged 

      Files in red = modified but not staged 
    
  cheacking the Branch and creating a new base branch
  
   # Step 1: Check your current branch
    git branch
    # → * main
    
    # Step 2: Create and switch to a new branch
    git checkout -b feature-login
    # → Switched to a new branch 'feature-login'
    
    # Step 3: Verify
    git branch
    # → main
    # → * feature-login   ← current branch
    
    # Step 4: Work on files, commit changes
    git add .
    git commit -m "Added login page UI"
    
    
        
        
