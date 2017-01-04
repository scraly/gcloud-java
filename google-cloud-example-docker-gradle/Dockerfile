FROM ubuntu:14.04

# Set the locale
RUN locale-gen en_US.UTF-8
ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

# Install Oracle JDK 8
RUN DEBIAN_FRONTEND=noninteractive apt-get update && \
    apt-get install -y \
    ca-certificates-java \
    curl \
    software-properties-common
RUN DEBIAN_FRONTEND=noninteractive add-apt-repository ppa:openjdk-r/ppa
RUN DEBIAN_FRONTEND=noninteractive apt-get update && \
    apt-get install -y openjdk-8-jdk

# Setup JAVA_HOME, this is useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64/
RUN export JAVA_HOME

ENV APP_DIR=/usr/lib/app/
RUN mkdir -p $APP_DIR
WORKDIR $APP_DIR
ADD build/libs/google-cloud-example-docker-gradle-all.jar .

CMD ["bash"]
