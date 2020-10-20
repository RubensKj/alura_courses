# YouTube Learning

<p>This is some of my youtube learning</p>

Useful website: https://tryhackme.com/

## Commands Found

### nmap

usage:

```
nmap -sC -sV -oN PATH_TO_FILE IP_FROM_MACHINE
```

### gobuster

```
gobuster -w PATH_TO_FILE_WITH_WORDS -u DOMAIN_URL
```

or

```
gobuster -w /opt/DirBuster-0.12/directory-list-2.3-medium.txt -u http://ip_or_domain/
```


### linpeas

### hydra

usage:

```
hydra -l USER_NAME -P FILE_OF_PASS ssh://IP_MACHINE
```

```
hydra -l jan -P /opt/rockyou.txt ssh://10.10.100.180
```

### enum4linux

used to found the users in a linux server

usage:

```
/opt/enum4linux/enum4linux.pl -a IP_FROM_MACHINE | tee enum4linux.log
```

### tee

used to keeping writing file

usage: 

```
tee FILE_NAME
```
