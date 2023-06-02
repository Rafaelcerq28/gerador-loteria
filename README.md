# Random Number Generator for Lotteries

This is a Java-based REST API service developed with Spring Boot that generates random numbers for lottery games.

## Available Endpoints

- `/megasena`: Returns six random numbers for the Mega-Sena game.
- `/quina`: Returns five random numbers for the Quina game.
- `/lotofacil`: Returns fifteen random numbers for the Lotofácil game.
- `/lotomania`: Returns twenty random numbers for the Lotomania game.


## How to Use

To use the API, make an HTTP GET request to the desired endpoint. For example:

GET /mega-sena


This will return a JSON object with the generated numbers:

```json
{
  "numbers": [5, 10, 22, 35, 42, 50]
}
```

## Running Locally

To run the service locally, make sure you have Java 19 and maven installed on your machine. Clone this repository and run the project.

The service will be available at `http://localhost:8080/gerador`.

## Contributing
Feel free to contribute new endpoints for other lottery games or improvements to the code. To do so, fork this repository and open a pull request with your changes.
