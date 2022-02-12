# build-GotchaRestLambda:
# 	./mvnw clean package -Dpackaging=docker-native -Dmicronaut.runtime=lambda -Pgraalvm
# 	cp -rf ./target/lambda $(ARTIFACTS_DIR)

build-GotchaRestLambda:
	./mvnw clean package -Dpackaging=docker-native -Dmicronaut.runtime=lambda -Pgraalvm
	unzip -d $(ARTIFACTS_DIR) ./target/function.zip 
