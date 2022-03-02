# Introduction

This document is intended for Technical Writers at **XXX**. It outlines the documentation development process. The document contains information on the following aspects of that process:

- Repository structure
- Branches
- Builds and pipelines

The main documentation product is the *OnlineHelp* delivered as part of the application. Users access the *OnlineHelp* by clicking the Help icon located in the upper right-hand corner of each application window.

The *OnlineHelp* is a set of HTML and  CSS files. 

Documentation development in **XXX** is closely aligned with software development. Therefore, most processes regarding documentation development mirror the software development processes. Technical Writers support development teams by producing end-user documentation to the new features and enhacements, and by documenting bug fixes and known issues.

## Repository structure 

The OnlineHelp repository is a git reposity located under this link: xxxxxxx. It includes the following folders:

- The **OnlineHelp documentation** folders containing the HTML and CSS files. Technical Writers edit these files in a dedicated WYSWIG editor.
- The **Translation** folders. This folder is used by the translation team to store translations of the OnlineHelp. 
- the **DevOps** folders with


## Branches

The OnlineHelp repository contains the following branches:

- **feature branches** - Branches created by each Technical Writer to store their work in progress.
- **dev** - Branch used during the development phase. When a Technical Writer has finished working on  their documentation task, they create a pull request to this branch so that their work is included in the OnlineHelp available in the test environments. No direct pushes are allowed to this branch.
- **release** - Branch used during the final phase, when the developent of new features and ehna
- hotfix
- master