<?php
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

class TI16Value
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'value',
            'isRequired' => false,
            'type' => TType::I16,
        ),
    );

    /**
     * @var int
     */
    public $value = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['value'])) {
                $this->value = $vals['value'];
            }
        }
    }

    public function getName()
    {
        return 'TI16Value';
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
                    if ($ftype == TType::I16) {
                        $xfer += $input->readI16($this->value);
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
        $xfer += $output->writeStructBegin('TI16Value');
        if ($this->value !== null) {
            $xfer += $output->writeFieldBegin('value', TType::I16, 1);
            $xfer += $output->writeI16($this->value);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
