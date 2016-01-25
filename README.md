Travis says: <img src="https://api.travis-ci.org/stil4m/mollie-api.png" />

# Mollie API Java

## License

The source code is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

## Java

This library requires Java 8.

## Dependencies

```
org.apache.httpcomponents:httpclient:4.3.X
com.fasterxml.jackson.core:jackson-annotations:2.6.X
com.fasterxml.jackson.core:jackson-databind:2.6.X
```

## Maven

This library is available on my [personal maven repository](https://github.com/stil4m/maven-repository), which is hosted on GitHub.

To use this with library with Maven, add the following snippets to your `pom.xml` file:

```
...
<repository>
    <id>stil4m-releases</id>
    <name>stil4m-releases</name>
    <url>https://github.com/stil4m/maven-repository/raw/master/releases/</url>
</repository>

...

<depencency>
    <groupId>nl.stil4m</groupId>
    <artifactId>mollie-api</artifactId>
    <version>1.4.0</version>
</depencency>

...
```

## Build the JAR

To build the `JAR` you can run `mvn install`.


## Usage

### Setup 

You can use the API with a static defined Mollie API key `Client` or a dynamic key `DynamicClient`.

#### Static

```
Client client = new ClientBuilder()
					.withApiKey(""XXX")
					.build();
```

#### Dynamic

```
DynamicClient client = new DynamicClientBuilder()
							.build();
```

#### Configuration

Both clients make use of the Jackson `ObjectMapper` and the Apache HTTP `HttpClient`. These can be respectivly configured using `withMapper` and `withClient`.

### API Calls

The API is seperated into different concepts:

* Methods: Used to read the available payment methods.
* Issuers: Used to read the available issuers per payment method.
* Payments: Used to create read and delete payments
* Refunds: Used to create read and delete refunds on payments
* Status: Used to verify the validity of the used API key
 
All concepts can be retrieved from the client using the following format `client.<concept>()`.

For example you can create a payment as follows:

```
Client client = new ClientBuilder()
					.withApiKey(""XXX")
					.build();
					
client.payments().create(new CreatePayment(...));
```

## Bugs

When you find bugs, please report them in the issue tracker. I pursuit to fix them within a few days. If you like provide a pull request with the supporting unit tests.
