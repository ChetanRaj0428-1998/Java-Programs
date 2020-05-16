

.model small
.data
buf db 257 dup(?)
.code
.startup
mov buf,10
mov dx,offset buf
mov ah,0ah
int 21h
.exit
end

