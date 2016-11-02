# Selenium Grid Dashboard

A dashboard based on Groupon's [Selenium Grid Extra's](https://github.com/groupon/Selenium-Grid-Extras), information is 
derived from all nodes using their REST api.

## Usage
* configure the selenium hub and node machines in a hocon or json file
* launch the dashboard with the path to the configuration file as an argument
* the dashboard is at http://localhost:8080 (default user and pass is admin/admin)

## Format config
```hocon
{
  port: "3000",
  config {
    endpoint = "/config"
    connectTimeout = 2000
    readTimeout = 10000
  }
  grid_status {
    endpoint = "/grid_status"
    connectTimeout = 2000
    readTimeout = 10000
  }
  system {
    endpoint = "/system"
    connectTimeout = 2000
    readTimeout = 10000
  }
  machines = [
    {
      name = "local"
      url = "http://local"
    },
    {
      name = "second-machine"
      url = "http://second-machine.domain.com"
    }
  ]
}
```