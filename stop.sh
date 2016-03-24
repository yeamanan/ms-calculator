#!/usr/bin/env bash
kill $(cat plus-service/plus-service.pid)
kill $(cat zuul-server/zuul-server.pid)
kill $(cat eureka-server/eureka-server.pid)
