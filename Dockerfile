FROM amazoncorretto:17
# Corretto is a binary distribution of the Open Java Development Kit (OpenJDK) with long-term support from Amazon.

# Reference dockerhub https://hub.docker.com/_/amazoncorretto

ENV CLASSPATH=".:/myLib:/myClass/*"