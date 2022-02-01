# Java SCORE Examples

This repository contains template of a java SCORE and instructions on how to deploy a simple java score.


## How to Run

### 1. Build the project

```
$ ./gradlew build
```
The compiled jar bundle will be generated at `./hello-world/build/libs/hello-world-0.1.0.jar`.

### 2. Optimize the jar

You need to optimize your jar bundle before you deploy it to local or ICON networks.
This involves some pre-processing to ensure the actual deployment successful.

`gradle-javaee-plugin` is a Gradle plugin to automate the process of generating the optimized jar bundle.
Run the `optimizedJar` task to generate the optimized jar bundle.

```
$ ./gradlew optimizedJar
```
The output jar will be located at `./hello-world/build/libs/hello-world-0.1.0-optimized.jar`.


### 3. Deploy the optimized jar

You can deploy using either of the following commands. The `build.gradle` in `hello-world` has 4 endpoints included. To deploy on Sejong, run the following command. To deploy on other networks, for example Lison, change `deployToSejong` to `deployToLisbon`.

1. 
    ```sh
    ./gradlew hello-world:deployToSejong -PkeystoreName=<your_wallet_json> -PkeystorePass=<password>
    # example below
    ./gradlew hello-world:deployToSejong -PkeystoreName='JavaTest' -PkeystorePass='p@ssw0rd'

    ```

To use the following command, make sure you have `gradle.properties` file with KeyWallet and password linked.

2. 
    ```sh
    ./gradlew hello-world:deployToSejong

    ```