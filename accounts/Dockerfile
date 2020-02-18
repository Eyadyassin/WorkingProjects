1 FROM golang:1.8-alpine 
2 ADD . /go/src/accounts 
3 RUN go install accounts
4 
 
5 FROM alpine:latest 
6 COPY --from=0 /go/bin/accounts . 
7 ENV PORT 8080 
8 CMD ["./accounts"] 
