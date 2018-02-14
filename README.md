# Spring-AngularJS-MSSQL

This is an application that contains two separate projects, **Spring Data** (DAO-Example) and **Spring WEB** (WebApi-Example) using **AngularJS** that consumes the rest queries.

## Getting Started

To get you started you can simply clone the `Spring-AngularJS-MSSQL` repository and install the dependencies:

### Prerequisites

You need git to clone the `Spring-AngularJS-MSSQL` repository. You can get git from [here][git].

We also use a number of Node.js tools to initialize and test the AngularJS Project. You must have Node.js
and its package manager (npm) installed. You can get them from [here][node].

### Clone `Spring-AngularJS-MSSQL`

Clone the `Spring-AngularJS-MSSQL` repository using git:

```
git clone https://github.com/hssamconf/Spring-AngularJS-MSSQL.git
cd Spring-AngularJS-MSSQL
```

If you just want to start a new project without the `Spring-AngularJS-MSSQL` commit history then you can do:

```
git clone --depth=1 https://github.com/hssamconf/Spring-AngularJS-MSSQL.git <your-project-name>
```

The `depth=1` tells git to only pull down one commit worth of historical data.

### Install Dependencies

We have two kinds of dependencies in this project: tools and Angular framework code. The tools help
us manage and test the application.

* We get the tools we depend upon via `npm`, the [Node package manager][npm].
* We get the Angular code via `bower`, a [client-side code package manager][bower].

We have preconfigured `npm` to automatically run `bower`, but you have to move on the AngularJS directory before running this command :

```
cd YOUR_PATH\Spring-AngularJS-MSSQL\WebApi-Example\src\main\resources\static
npm install
```

Behind the scenes this will also call `bower install`. After that, you should find out that you have
two new folders in your project.

* `node_modules` - contains the npm packages for the tools we need
* `app/bower_components` - contains the Angular framework files

### Run the Application

Run the WebApi-Example using Spring Boot

Now browse to the app at [`localhost:8000/app/index.html`][local-app-url].