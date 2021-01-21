echo "installing docker"
sudo yum remove docker \
                  docker-client \
                  docker-client-latest \
                  docker-common \
                  docker-latest \
                  docker-latest-logrotate \
                  docker-logrotate \
                  docker-engine
echo "install the repository"
sudo yum install -y yum-utils
sudo yum-config-manager \
    --add-repo \
    https://download.docker.com/linux/centos/docker-ce.repo
echo "install the engine"
sudo yum install docker-ce --nobest
echo "starting docker"
sudo systemctl start docker
echo "check to see if docker is running"
#sudo docker run hello-world

echo "installing maven"
sudo wget http://repos.fedorapeople.org/repos/dchen/apache-maven/epel-apache-maven.repo -O /etc/yum.repos.d/epel-apache-maven.repo
sudo sed -i s/\$releasever/6/g /etc/yum.repos.d/epel-apache-maven.repo
sudo yum install --nobest -y apache-maven
echo "maven installed"