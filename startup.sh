#!/usr/bin/env bash
./gradlew build
./gradlew bootRun -p eureka-server &
./gradlew bootRun -p zuul-server &
./gradlew bootRun -p plus-service &
