# bb4-project-template
A trivial bb4 project that can be used as a template when creating new bb4 projects. 

## How to use it

First create a new bb4-<new project> repository in github with no files in it.
Then either
 * Create a [bare cone](https://help.github.com/articles/duplicating-a-repository/) and modify it, or
 * Manually copy the project files from a clone of bbb4-project-template into a new clone of the empty bb4-<new project> 
 directory on the file system. Do not copy the iml file or the folllowing directories:
   * .* (.git, .gradle, .idea) 
   * build
   * gradle
   * out
 
I prefer the second approach because then it will not have the git history from bb4-project-template.
 
