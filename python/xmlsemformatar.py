
arquivo = open("dados3.xml", "w")
numero_alunos = 3     # parâmetro que indica a quantidade de alunos
alunos = numero_alunos+1    # parâmetro utilizado

arquivo.write("<?xml version=\"1.0\"?>")
arquivo.write("<lista>")

for i in range(alunos):
    ra = 726000 + i
    aluno = "<aluno>"\
            "<nome>Nome Aluno {}</nome>"\
            "<email>email_aluno{}@gmail.com</email>"\
            "<ra>{}</ra>"\
            "</aluno>".format(i,i,ra)
    arquivo.write(aluno)

arquivo.write("</lista>")
arquivo.close()