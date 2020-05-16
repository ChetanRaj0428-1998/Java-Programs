repeat 12
endm
 .model small
 .data
 abc db 10,13,'display n lines$'
 .code
 .startup
 repeat 12
 mov ah,09h
 mov dx,offset abc
 int 21h
 endm
 .exit
 end













