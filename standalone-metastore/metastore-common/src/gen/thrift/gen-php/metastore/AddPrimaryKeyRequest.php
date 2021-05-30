<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class AddPrimaryKeyRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'primaryKeyCols',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\SQLPrimaryKey',
                ),
        ),
    );

    /**
     * @var \metastore\SQLPrimaryKey[]
     */
    public $primaryKeyCols = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['primaryKeyCols'])) {
                $this->primaryKeyCols = $vals['primaryKeyCols'];
            }
        }
    }

    public function getName()
    {
        return 'AddPrimaryKeyRequest';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::LST) {
                        $this->primaryKeyCols = array();
                        $_size396 = 0;
                        $_etype399 = 0;
                        $xfer += $input->readListBegin($_etype399, $_size396);
                        for ($_i400 = 0; $_i400 < $_size396; ++$_i400) {
                            $elem401 = null;
                            $elem401 = new \metastore\SQLPrimaryKey();
                            $xfer += $elem401->read($input);
                            $this->primaryKeyCols []= $elem401;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('AddPrimaryKeyRequest');
        if ($this->primaryKeyCols !== null) {
            if (!is_array($this->primaryKeyCols)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('primaryKeyCols', TType::LST, 1);
            $output->writeListBegin(TType::STRUCT, count($this->primaryKeyCols));
            foreach ($this->primaryKeyCols as $iter402) {
                $xfer += $iter402->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
