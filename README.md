# 🚀 Smallrye LLM

Experimentation around LLM and MicroProfile

## How to run examples

### Use LM Studio

#### Install LM Sutdio

https://lmstudio.ai/

#### Download model 

Mistral 7B Instruct v0.2

#### Run

On left goto "local server", select the model in dropdown combo on the top, then start server

### Use Ollama

Running Ollama with the llama3.1 model:

```shell
$CONTAINER_ENGINE= podman | docker
$CONTAINER_ENGINE run -d --rm --name ollama --replace --pull=always -p 11434:11434 -v ollama:/root/.ollama --stop-signal=SIGKILL docker.io/ollama/ollama
$CONTAINER_ENGINE exec -it ollama ollama run llama3.1
```

### Run the examples

Go to each example READEM.md to see how to execute the example.

## Contributing
If you want to contribute, please have a look to [CONTRIBUTING.md](CONTRIBUTING.md)

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

