####AWS Serverless Api Using Micronaut and Graalvm.

### Before Build/Package/Deploy
Change aws profile to __dev__ or __prod__

#### Build:

-  For dev:
    - sam build __--config-env dev__

- For prod:
    - sam build __--config-env prod__

- Require __docker__ and __make__ to be installed.
-  For windows, using wsl might be easier.

#### Package:
-  For dev:
    - sam package __--config-env dev__

- For prod:
    - sam package __--config-env prod__

#### Deploy
-  For dev:
    - sam deploy __--config-env dev__

- For prod:
    - sam deploy __--config-env prod__

## Micronaut 3.3.1 Documentation

- [User Guide](https://docs.micronaut.io/3.3.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.3.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.3.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Handler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

Handler: io.micronaut.function.aws.proxy.MicronautLambdaHandler

## Deployment with GraalVM

If you want to deploy to AWS Lambda as a GraalVM native image, run:

```bash
./gradlew buildNativeLambda -Pmicronaut.runtime=lambda
```

This will build the GraalVM native image inside a docker container and generate the `function.zip` ready for the deployment.

## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)

## Feature aws-lambda-custom-runtime documentation

- [Micronaut Custom AWS Lambda runtime documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambdaCustomRuntimes)

- [https://docs.aws.amazon.com/lambda/latest/dg/runtimes-custom.html](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-custom.html)

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

